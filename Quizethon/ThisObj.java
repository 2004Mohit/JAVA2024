
class ThisObj{
        ThisObj() {
                System.out.println("In constructor");
                System.out.println(this);
                System.out.println("--/--");
        }
        public static void main(String[] args){

                ThisObj obj = new ThisObj();
                System.out.println("In main");
                System.out.println(obj);

        }
}
