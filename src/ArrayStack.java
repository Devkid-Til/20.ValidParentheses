public class ArrayStack<E> implements Stack {

    Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }
    public ArrayStack() {
        array = new Array<>();
    }


    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
    @Override
    public void push(Object e) {
        array.addLast((E) e);
    }
    @Override
    public E pop() {
        return array.removeLast();
    }
    @Override
    public E peek() {
        return array.getLast();
    }
    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append("Stack:");
        res.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++){
            stack.push(i);
            System.out.println(stack);


        }
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.getSize());



    }
}
