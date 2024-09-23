package com.wipro.channels;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SocketChannelDemo {

    public static void main(String[] args) throws IOException {
        SocketChannel server = SocketChannel.open();
        SocketAddress socketAddr = new InetSocketAddress("localhost", 3306);
        server.connect(socketAddr);

        Selector selector = Selector.open();
        server.configureBlocking(false);
        server.register(selector, SelectionKey.OP_CONNECT);

        Path path = Paths.get("E:/Test/input.txt");
        FileChannel fileChannel = FileChannel.open(path);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        
        // Debug print
        System.out.println("Starting file read and write operations...");

        while (fileChannel.read(buffer) > 0) {
            buffer.flip();
            
            // Debug print buffer content
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            System.out.println();
            
            // Write to SocketChannel
            buffer.flip();
            server.write(buffer);
            buffer.clear();
        }

        fileChannel.close();
        server.close();

        // Debug print
        System.out.println("File Sent to the Socket Channel");
    }
}
