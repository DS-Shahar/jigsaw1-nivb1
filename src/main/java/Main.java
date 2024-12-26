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
		Node<Integer> save = a;
		Node<Integer> cur = a;
		while(a!=null) {
			cur = a;
			while(cur.hasNext()) {
			//	System.out.println(1);
				
			if(a.getValue()==cur.getNext().getValue()) {
				cur.setNext(cur.getNext().getNext());
			}
			else {
				cur=cur.getNext();
			}
			}
			
			a = a.getNext();
		}
		return save;
	}
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
