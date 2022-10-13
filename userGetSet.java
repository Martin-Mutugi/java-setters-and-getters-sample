 //A simple  Area of a Rectangle using setters and getters.
public class userGetSet {
    //Private modifiers
    private int length;
    private int width;
    // area is set to be public
    public int area;
    //set method for both length and width
    public void setLength(int length){
        this.length=length;
    }
        public void setWidth(int width) {
            this.width=width;
        }
        //getters method for both length and width
        public int getLength(){
            return length;
        }
        public int getWidth(){
            return width;
        }
        // area function
        public int getArea(){
            return getLength()*getWidth();
        }
        // demo for userGetSet
        public static class userGetSetDemo{
            public  static void main(String[] args) {
                //gs is the object for our case(you can use any word)
                userGetSet gs=new userGetSet();
                gs.setLength(7);
                gs.setWidth(5);
                // the outputs
                System.out.println("Length is \t:"+gs.getLength());
                System.out.println("Width is \t:"+gs.getWidth());
                System.out.println("===***Area***===\n");
                System.out.println("Area of a Rectangle is \t:"+gs.getArea());

                
                
            }
        }
    }

