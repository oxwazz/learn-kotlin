fun main() {
    // data types - integer number
    var age: Byte = 30;
    var height: Int = 170;
    var distance: Short = 2000;
    var balance: Long = 1000000000L;

    // data types - floating point
    var value: Float = 98.98F;
    var radius: Double = 23123123123.321312;

    // literal
    var decimalLiteral: Int = 101;
    var hexadecimalLiteral: Int = 0x65; // 101
    var binaryLiteral: Int = 0b1100101; // 101

    // underscore in number
    var age_: Byte = 3_0;
    var height_: Int = 1_7_0;
    var distance_: Short = 2_000;
    var balance_: Long = 100_000_000L;

    // number function
    var number: Int = 100;
    var byte: Byte = number.toByte();
    var short: Short = number.toShort();
    var long: Long = number.toLong();
    var float: Float = number.toFloat();
    var double: Double = number.toDouble();

}