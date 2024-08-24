import java.util.Scanner;

class Dmart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();
        
        System.out.println("Enter gender:");
        String gender = sc.nextLine();

        System.out.println("Enter Item1:");
        String item1Name = sc.nextLine();
        System.out.println("Enter no of item1:");
        int item1Count = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.println("Enter Item2:");
        String item2Name = sc.nextLine();
        System.out.println("Enter no of item2:");
        int item2Count = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.println("Enter Item3:");
        String item3Name = sc.nextLine();
        System.out.println("Enter no of item3:");
        int item3Count = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.println("Enter Item4:");
        String item4Name = sc.nextLine();
        System.out.println("Enter no of item4:");
        int item4Count = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.println("Enter Item5:");
        String item5Name = sc.nextLine();
        System.out.println("Enter no of item5:");
        int item5Count = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.println("Enter price of Item1:");
        int price1 = sc.nextInt();
        System.out.println("Enter price of Item2:");
        int price2 = sc.nextInt();
        System.out.println("Enter price of Item3:");
        int price3 = sc.nextInt();
        System.out.println("Enter price of Item4:");
        int price4 = sc.nextInt();
        System.out.println("Enter price of Item5:");
        int price5 = sc.nextInt();

        int totalPrize1 = item1Count * price1;
        int totalPrize2 = item2Count * price2;
        int totalPrize3 = item3Count * price3;
        int totalPrize4 = item4Count * price4;
        int totalPrize5 = item5Count * price5;

        int totalAmount = totalPrize1 + totalPrize2 + totalPrize3 + totalPrize4 + totalPrize5;

        System.out.println("         DMART        ");
        System.out.println("Name: " + name);
        System.out.println("Date: " + "27/11/2024");
        System.out.println("Gender: " + gender);
        System.out.println("----------------------");
        System.out.println("Item Name\tQuantity\tPrice\tTotal");
        System.out.println(item1Name + "\t" + item1Count + "\t" + price1 + "\t" + totalPrize1);
        System.out.println(item2Name + "\t" + item2Count + "\t" + price2 + "\t" + totalPrize2);
        System.out.println(item3Name + "\t" + item3Count + "\t" + price3 + "\t" + totalPrize3);
        System.out.println(item4Name + "\t" + item4Count + "\t" + price4 + "\t" + totalPrize4);
        System.out.println(item5Name + "\t" + item5Count + "\t" + price5 + "\t" + totalPrize5);
        System.out.println("----------------------");
        System.out.println("Total Amount: " + totalAmount);

        if (totalAmount >= 3000 && totalAmount < 5000) {
            System.out.println("You get a flat Rs 500 discount");
            totalAmount -= 500;
        } else if (totalAmount >= 5000 && totalAmount < 10000) {
            System.out.println("You get a 30% discount on total bill");
            totalAmount -= (totalAmount * 30) / 100;
        } else if (totalAmount >= 10000 && totalAmount < 15000) {
            System.out.println("You won a mixer");
        } else if (totalAmount >= 15000) {
            System.out.println("You won a suitcase");
        }

        System.out.println("Final Amount: " + totalAmount);
    }
}
