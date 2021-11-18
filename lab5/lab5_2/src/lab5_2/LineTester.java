/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2;

/**
 *
 * @author USER
 */
public class LineTester {
    public static void main(String[] args) {
        Line line1 = new Line(0,2);
        Line line2 = new Line(2,1);
        System.out.println("Are the two lines equals?: "+line1.isEquals(line2));
        System.out.println("Are the two lines parallel?: "+line1.isParallel(line2));
        System.out.println("Are the two lines intersect?: "+line1.isIntersect(line2));
        System.out.println(line1.getIntersectionPoint(line2));
    }
}
