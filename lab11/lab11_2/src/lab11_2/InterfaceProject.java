
package lab11_2;

import java.util.ArrayList;


public class InterfaceProject {

    
    public static void main(String[] args) {
       Ground ground1 = new Ground("Bangkok Ground");
        Pool pool1 = new Pool("Chula swimming pool");
        Sky sky1 = new Sky("Japan Sky");
// 1. ทดลองรันและดูผลลัพธ์      
        System.out.println("**************1*************");
        Fish fish1 = new Fish("Nemo");
        fish1.swim(ground1);
        fish1.swim(pool1);
        fish1.swim(sky1);  
        System.out.println("****************************");
        
// 2. สร้าง object จาก class Cat และใช้งาน method ใน CanWalk ดูตัวอย่างจาก Fish
//  เสร็จแล้วผลลัพธ์ต้องตรงกับผลรัน
        System.out.println("**************2*************");
        Cat cat1 = new Cat("Garfield");
        cat1.walk(ground1);
        cat1.walk(pool1);
        cat1.walk(sky1);
        cat1.run(ground1);
        cat1.run(pool1);
        cat1.run(sky1);
        System.out.println("****************************");

// 3. สร้าง object จาก class Bird และใช้งาน method ใน CanWalk และ CanFly 
//  เสร็จแล้วผลลัพธ์ต้องตรงกับผลรัน
        System.out.println("**************3*************");
         Bird bird1 = new Bird("Red Angry Bird");
         bird1.walk(ground1);
         bird1.walk(pool1);
         bird1.walk(sky1);
         bird1.run(ground1);
         bird1.run(pool1);
         bird1.run(sky1);
         bird1.fly(ground1);
         bird1.fly(pool1);
         bird1.fly(sky1);
        System.out.println("****************************");
        
// 4.   สร้าง ArrayList Terrain และ add ground1, pool1 และ sky1 ลงไปตามลำดับ
//      สร้าง ArrayList Animal และ add cat1, fish1 และ bird1 ลงไปตามลำดับ
        ArrayList<Terrain> t = new ArrayList<Terrain>();
        ArrayList<Animal> a = new ArrayList<Animal>();
        t.add(ground1);
        t.add(pool1);
        t.add(sky1);
        a.add(cat1);
        a.add(fish1);
        a.add(bird1);
        System.out.println("**************4*************");        
 //     Uncomment code ด้านล่าง ลองอ่าน code และทำความเข้าใจ ดูผลลัพธ์ที่เกิดขึ้น        
        for(Animal animal:a) {
            for(Terrain terrain:t) {
                if (animal instanceof CanWalk) {
                    ((CanWalk) animal).walk(terrain);
                    ((CanWalk) animal).run(terrain);
                } 
                if (animal instanceof CanSwim) {
                    ((CanSwim) animal).swim(terrain);
                }
                if (animal instanceof CanFly) {
                    ((CanFly) animal).fly(terrain);
                }               
            }
            System.out.println("****************************");
        }     
    }
    }
    

