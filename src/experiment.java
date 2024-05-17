
public class experiment {

        public static  class Lion {
            private String color;
            private double weight;
            private  int age;

            public Lion(String color, double weight, int age) {
                this.color = color;
                this.weight = weight;
                this.age = age;
            }

            public boolean isVegetarian() {return false; // Lions are carnivores
            }

            public boolean canClimb() {
                return false; // Lions cannot climb trees
            }

            public String getSound() {
                return "Roar";
            }
        }

        public static class Monkey {
            private String color;
            private double weight;
             private int age;

            public Monkey(String color, double weight, int age) {
                this.color = color;
                this.weight = weight;
                this.age = age;
            }

            public boolean isVegetarian() {
                return true; // Monkeys are usually vegetarians
            }

            public boolean canClimb() {
                return true; // Monkeys can climb trees
            }

            public String getSound() {
                return "Ooh ooh ah ah";
            }
        }

        public static class Elephant {
            private String color;
            private double weight;
            private int age;

            public Elephant(String color, double weight, int age) {
                this.color = color;
                this.weight = weight;
                this.age = age;
            }

            public boolean isVegetarian() {
                return true; // Elephants are herbivores
            }

            public boolean canClimb() {
                return false; // Elephants cannot climb trees
            }

            public String getSound() {
                return "Trumpet";
            }
        }

        public static void main(String[] args) {
            // You can create instances of these animal classes and use their methods here.
            Lion l=new Lion("Yellow",34.344,24);
            System.out.println(l.color);
            System.out.println(l.weight);
            System.out.println(l.age);
            System.out.println(l.isVegetarian());
            System.out.println(l.canClimb());
            System.out.println(l.getSound());
            System.out.println("*---------------------*");


            Monkey m=new Monkey("Brown",12.56,20);
            System.out.println(m.color);
            System.out.println(m.weight);
            System.out.println(m.age);
            System.out.println(m.isVegetarian());
            System.out.println(m.canClimb());
            System.out.println(m.getSound());
            System.out.println("*-------------------*");

            Elephant E=new Elephant("Black",112.67,58);
            System.out.println(E.color);
            System.out.println(E.weight);
            System.out.println(E.age);
            System.out.println(E.isVegetarian());
            System.out.println(E.canClimb());
            System.out.println(E.getSound());

        }
    }

