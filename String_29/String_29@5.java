class StringDemo5{
        public static void main(String [] args){
                StringBuffer sb  = new StringBuffer("Shashi");
                System.out.println(sb);

                System.out.println(System.identityHashCode(sb));
		sb = sb.append("Bagal");
		System.out.println(System.identityHashCode(sb));
		Systm.oy.println(sb capacity());
        }
}
