var Demo = /** @class */ (function () {
    function Demo() {
    }
    Demo.prototype.getDataTypes = function () {
        var flag = true;
        var amount = 100000;
        var city = "MAharashtra";
        var pi = 3.141;
        var arr = [10, 20, 30, 40, 50, 60, 70, 80, 90];
        console.log("flag " + flag);
        console.log("amount " + amount);
        console.log("city " + city);
        console.log("pi " + pi);
        console.log(arr);
    };
    return Demo;
}());
var des = new Demo();
des.getDataTypes();
