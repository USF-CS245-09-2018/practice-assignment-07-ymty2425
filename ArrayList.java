public class ArrayList implements List {

	protected Object[] arr;
	protected int size;

	public int size() {
		return size;
	}
	public ArrayList() {
		arr=new Object[10];
		size=0;
	}

	public void growArray() {
		Object[] b=new Object[arr.length * 2];
		for (int i=0; i<arr.length; i++) {
			b[i]=arr[i];
		}
		arr=b;
	}

	@Override
	public void add(Object obj) {
		add(size,obj);
	}

	@Override
	public void add(int pos, Object obj) {
		if (arr.length==size)
			growArray();
		for (int i=size;i>pos;i--)
			arr[i]=arr[i-1];
		arr[pos]=obj;
		size++;
	}

	public Object get(int pos) {
		if(pos<0||pos>=size)
			return null;
		return arr[pos];
	}

	public Object remove(int pos) {
		Object temp = arr[pos];
		for (int i=pos; i<size-1; i++)
			arr[i]=arr[i+1];
		size--;
		return temp;

	}
}