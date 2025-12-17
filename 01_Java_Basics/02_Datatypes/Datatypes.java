class Datatypes{
    public static void main(String[] args) {
        //Integer
        byte by = 127; //range: -2^7 to 2^7-1 i.e., -128 to 127 ---> 1 byte
        short sh = 558; //2 bytes
        int n = 8; //4 bytes
        long l = 5854l; //8 bytes ---> ends with l

        //Float
        float f = 0.54f; //4 bytes ---> ends with f ---> limited precision
        double d = 0.54; //8 bytes ---> default in java ---> longer precision

        //Character
        char c = 'k'; //2 bytes ---> single quote, length is one (can contain only one character)

        //Boolean 
        boolean b = true; //takes value true or false (not 0 or 1)

    }
}