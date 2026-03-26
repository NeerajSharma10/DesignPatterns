package iterator;

class MyList {
    int[] arr = {1, 2, 3};

    public Iterator getIterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator {
        int index = 0;

        public boolean hasNext() {
            return index < arr.length;
        }

        public int next() {
            return arr[index++];
        }
    }
}
