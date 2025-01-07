List<String> wordsLinkedList = new LinkedList<String>(words);
List<String> wordsVectors = new Vector<String>(words);
List<String> words =List.of("Apple","Bat","Cat");
List<String> wordsArrayList = new ArrayList<String>(words);
wordsArrayList.add("Elephant");
wordsArrayList.add(2,"Ball");
wordsArrayList
List<String> ll = List.of("SDS","DFt");
wordsArrayList.addAll(ll)
wordsArrayList
wordsArrayList.set(4,"Fish");
wordsArrayList
wordsArrayList.remove(2);
wordsArrayList.remove("SDS");
wordsArrayList
List<String> wordsV = new Vector<String>(wordsArrayList);
wordsArrayList
for(int i =0 ; i < wordsArrayList.size();i++){
    System.out.println(wordsArrayList.get(i));}
for(String w:wordsArrayList){
    System.out.println(w);
}
Iterator w = wordsArrayList.iterator();
while(w.hasNext()){
    System.out.println(w.next());}