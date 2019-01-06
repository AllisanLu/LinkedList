public class Tester {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        list.remove(2);

        for(int i = 0; i < list.size(); i++){
            if(list.getCurrent().getValue() == null)
                System.out.println(" Current: " + list.getCurrent() +
                        " Previous: " + list.getCurrent().getPrevious() +
                        " Next: " + list.getCurrent().getNext() + " " + list.getCurrent().getNext().getValue());

            else if(list.getCurrent().getPrevious() == null)
                System.out.println(" Current: " + list.getCurrent() + " " + list.getAt(i) +
                    " Previous: " + list.getCurrent().getPrevious() +
                    " Next: " + list.getCurrent().getNext() + " " + list.getCurrent().getNext().getValue());

            else if(list.getCurrent().getNext() == null)
                System.out.println(" Current: " + list.getCurrent() + " " + list.getAt(i) +
                        " Previous: " + list.getCurrent().getPrevious() + " " + list.getCurrent().getPrevious().getValue() +
                        " Next: " + list.getCurrent().getNext());
            else
                System.out.println(" Current: " + list.getCurrent() + " " + list.getAt(i) +
                        " Previous: " + list.getCurrent().getPrevious() + " " + list.getCurrent().getPrevious().getValue() +
                        " Next: " + list.getCurrent().getNext() + " " + list.getCurrent().getNext().getValue());
        }
    }
}
