

public class _19RemoveNthFromEnd {


 
  
     public static ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp = head;
          int count = 1;
         if ((head.next == null) & (n==1)){
               head = null;
           }
           
           else if (head.next.next == null){
               if (n==1){
                   head.next = null;
               }
               if (n==2){
                   head = head.next;
               }}
               
          else{
          //count elements in list
          while (temp.next != null){
              temp = temp.next;
              count++;
          }

          //locate the element before the one to be removed
          temp = head;
          for (int i=1; i<count-n; i++){
              temp =  temp.next;
          }
          
          temp.next = temp.next.next;}
          return head;
      }

     
     public static void main(String[] args){
      System.out.println("ok");
      ListNode test = new ListNode(1);
      test.next = new ListNode(2);
      test.next.next = new ListNode(3);
      test.next.next.next = new ListNode(4);
      test.next.next.next.next = new ListNode(5);
      
      test = removeNthFromEnd(test,2);
      System.out.print(test.next.next.next.val);
        
     }
     
     
 
}
  
