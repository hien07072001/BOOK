public class Test {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook("01","toan",60,"A","Java", "");
        System.out.println(book1);

        ProgrammingBook book2 = new ProgrammingBook("02","van", 45,"B", "Java", "");
        System.out.println(book2);

        ProgrammingBook book3 = new ProgrammingBook("03","anh", 36,"C", "nhat","");
        System.out.println(book3);

        FictionBook book4 = new FictionBook("04","vat li",70, "D","vat li1");
        System.out.println(book4);

        FictionBook book5 = new FictionBook("05","hoa hoc", 61, "E", "hoa hoc 1");
       System.out.println(book5);

        FictionBook book6 = new FictionBook("06", "sinh hoc", 92, "F","sinh hoc 1");
        System.out.println(book6);

        Book[]arr={book1,book2,book3,book4,book5,book6};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum +=arr[i].price;
        }
        System.out.println("tong gia cua 6 cuon sach la :"+sum);


        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] instanceof ProgrammingBook){
                if (((ProgrammingBook)arr[i]).language.equals("Java")){
                    count++;

                }

            }
        }
        System.out.println("tong ten java:"+count);

    }
}
