package com.abg;

public class vector_lleno_incompleto {
    public static void main(String[] args) {
        Integer[] v1 = new Integer[10];
        Integer[] v2 = {2,3,4,5,6,7};

        System.out.println(lleno(v1) ? "LLENO" : "HUECO" );
        System.out.println(lleno(v2) ? "LLENO" : "HUECO" );
    }

    public static boolean lleno(Integer[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[1]==null) {
                return false;
            }
        }
        return true;

    }
}
