/**
 * stack_implementation_by_using_Array
 */
public class stack_implementation_by_using_Array {
    static class stacks{
        int [] arr;
        int top;
        int size;

        stacks(int size){
            this.arr = new int[size];
            this.top = -1;
            this.size = size;
        }

        public void push(int ele){
            if(top != size - 1){
                top++;
                arr[top] = ele;
            }
            else{
                throw new IllegalStateException("Stack Overflow : cannot push ele because stack is full");
                // System.out.println("Stack Overflow");
            }
        }

        public int pop(){
            if(top == -1){
                throw new IllegalStateException("Stack Underflow : cannot pop ele from Empty stack"); 
            }
            else{
                int pop_ele = arr[top];
                top--;
                return pop_ele;
            }
        }

        public int peek(){
            if(top >= 0)return arr[top];
            else throw new IllegalStateException("cannot return top ele because stack is Empty");
        }

        public boolean isEmpty(){
            return top == -1;
        }
    }

    public static void main(String[] args) {
        stacks st = new stacks(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st.pop());//4
        System.out.println(st.pop());//3
        System.out.println(st.peek());//2
        System.out.println(st.isEmpty());//false
        
    }
}
