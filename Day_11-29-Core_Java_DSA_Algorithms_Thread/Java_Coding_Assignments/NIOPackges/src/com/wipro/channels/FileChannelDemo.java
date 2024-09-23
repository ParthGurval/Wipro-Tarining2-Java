package com.wipro.channels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		RandomAccessFile file = new RandomAccessFile("E:/Test/input.txt", "r");

		FileChannel fileChannel = file.getChannel();

		ByteBuffer byteBuffer = ByteBuffer.allocate(512); // creates new buffer of size 512 bytes

		while (fileChannel.read(byteBuffer) > 0) {

			byteBuffer.flip();

			while (byteBuffer.hasRemaining()) {

				System.out.print((char) byteBuffer.get());

			}

		}

		fileChannel.close();

	}
}
