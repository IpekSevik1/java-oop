package pack.constructor.ornek1;
    public class Rectangle {
        private double length;
        private double width;
        private double area;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
            calculateArea();
        }

        public void calculateArea() {
            area = length * width;
            System.out.println("Your area is: " + area);
        }
    }
