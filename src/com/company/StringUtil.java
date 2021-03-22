package com.company;

public class StringUtil {
    /*
        Partiendo de la clase StringUtil (que usamos para resolver Radix Sort), agregar los siguientes
        métodos estáticos:
        ● public static String rpad(String s,char c,int n); idem lpad, pero agregando caracteres a
        la derecha.

        ● public static String ltrim(String s); Retorna una cadena idéntica a s pero sin espacios a
        la izquierda.
        ● public static String rtrim(String s); idem ltrim, pero sin espacios a la derecha.
        ● public static String trim(String s); idem lpad, pero sin espacios a derecha ni izquierda.
        ● public static int indexOfN(String s,char c,int n); Retorna la posición de la n-ésima
        ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s =
        “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
        segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es:
     */

    public static String rpad(String s, char c, int n){
        for(int i = s.length(); i <= n - s.length(); i++){
            s += c;
        }
        return s;
    }

    public static String ltrim(String s){
        for (int i = 0 ; i < s.length() - 1; i++) {
            if(s.charAt(i) != ' ')
                return s.substring(i);
        }
        return s;
    }

    public static String rtrim(String s){
        int position = s.length();
        for (int i = position - 1; i > 0; i--) {
            if(s.charAt(i) != ' ')
                return s.substring(0,i + 1);
        }

        return s;
    }

    public static String trim(String s){
        return s.replace(" ", "");
    }

    public static int indexOfN(String s, char c, int n){
        int ocurrencies = 0;
        for(int i = 0; i < s.length(); i++){
            if(c == s.charAt(i)){
                if(n == ++ocurrencies)
                    return  i;
            }
        }
        return  -1;
    }

}
