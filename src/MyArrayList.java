class MyArrayList implements MyList{
    private String[] array = new String[10];
    private int size = 0;

    public void add(String str) {
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for(int i = 0; i< array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = str;
        size++;
    }

    public String[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void remove(String str) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public String get(int index) {
        return null;
    }
}
