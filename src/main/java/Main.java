class Main {
  public static Node<Integer> f(Node<Integer> list){
		Node <Integer> newlist = new Node<Integer>(list.getNext().getValue());
		Node <Integer> n = new Node<Integer>(-1);
		Node <Integer> s = n;
		while (list!=null) {
			n.setNext(list.getNext());
			list.setNext(list.getNext().getNext());
			list = list.getNext();
			n = n.getNext();
		}
		
		return s.getNext();
		
	}
  public static Node<Integer> q1(Node<Integer> a){
		Node<Integer> st = a;
		while(a.hasNext()) {
			while(a.hasNext()) {
			if(a.getValue()==a.getNext().getValue()) {
				a.setNext(a.getNext().getNext());
			}
			else {
				a=a.getNext();
			}
			}
			a = st;
			a = a.getNext();
		}
		return st;
	}
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
