public class SequencedCollections {
    public static void main(String[] args) {

        //Create the collection
        var seqCollection = SequencedCollection.of(1.2,3,4,5);

        //Iterate over the collection
        seqCollection.forEach(System.out::println);
    }
}
