class Demo5{
        public static void main (String [] args){
                String str1 = " Shashi";
                String str2 = "Rathod";
                String str3 = str1+str2;
                String str4 =new String("ShashiRathod");
                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));
                System.out.println(System.identityHashCode(str3));
                System.out.println(System.identityHashCode(str4));
        }
}
