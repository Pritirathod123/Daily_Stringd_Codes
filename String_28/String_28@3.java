class Demo3{
        public static void main (String [] args){
                String str1 = " Shashi";
                String str2 = "Rathod";
                String str3 = new String("Shashi");
		String str4 = "ShashiRathod";
                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));
                System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
        }
}
