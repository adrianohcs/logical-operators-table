package logicaloperatorstable;

public class LogicalOpTable {
    public static void main(String[] args) {
        boolean x, y;
        System.out.println("TABLE OF LOGICAL OPERATORS----------------------------");
        System.out.println("X\t\tY\t\tAND\t\tOR\t\tXOR\t\tNOT(X)\tNOT(Y)");
        x = y = false;
        System.out.print(x + "\t" + y + "\t" + (x && y) + "\t" + (x || y) + "\t");
        System.out.println((x ^ y) + "\t" + !(x) + "\t" + !(y));
        x = false; y = true;
        System.out.print(x + "\t" + y + "\t" + (x && y) + "\t" + (x || y) + "\t");
        System.out.println((x ^ y) + "\t" + !(x) + "\t" + !(y));
        x = true; y = false;
        System.out.print(x + "\t" + y + "\t" + (x && y) + "\t" + (x || y) + "\t");
        System.out.println((x ^ y) + "\t" + !(x) + "\t" + !(y));
        x = y = true;
        System.out.print(x + "\t" + y + "\t" + (x && y) + "\t" + (x || y) + "\t");
        System.out.println((x ^ y) + "\t" + !(x) + "\t" + !(y));
    }
}
