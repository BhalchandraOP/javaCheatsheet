list.stream().forEach(elem -> System.out.println(elem));
List<Integer> list = List.of(1,2,34,5);
list.stream().forEach(
element -> System.out.println("element -" + element)
);
list.stream().forEach(
element -> System.out.println("element -" + element)
);
list.stream().filter(
element -> element%2==0)
.forEach(
element -> System.out.println("element -" + element)
);
list.stream().filter(
element -> element%2==1)
.forEach(
element -> System.out.println("element -" + element)
);
list.stream().filter(element -> element%2==1).forEach(element -> System.out.println("Element - "+element));
numbers.stream().sorted()
.forEach(e -> System.out.println(e));
numbers.stream().distinct()
.forEach(e -> System.out.println(e));
numbers.stream().distinct().map(e -> e*e)
.forEach(e -> System.out.println(e));
List<Integer> numbers = List.of(4,6,23,56,23,85,45,6,78,898,84);
IntStream.range(0,10).forEach(p->System.out.println(p))
IntStream.range(0,10).forEach(p->System.out.println(p))
IntStream.range(0,10).forEach(p->System.out.println(p))
IntStream.range(0,10).forEach(p->System.out.println(p))
IntStream.range(0,10).map(e -> e*e).forEach(p->System.out.println(p))
IntStream.range(0,10).map(e -> e*e).forEach(p->System.out.println(p))
IntStream.range(1,11).map(e -> e*e).forEach(p->System.out.println(p))
List.of("Apple","Bat","Ant").stream().map(s ->s.toLowerCase()).forEach(p -> System.out.println(p))
List.of("Apple","Bat","Ant").stream().map(s ->s.toLowerCase()).forEach(p -> System.out.println(p))
IntStream.range(1,11).reduce(0,(n1,n2) -> n1+n2)
List.of(3,43,4,68,9).stream().max((n1,n2)->Integer.compare(n1,n2)).get()
List.of(3,4,5,24,54).stream().min((s1,s2) -> Integer.compare(s1,s2))
List.of(0).stream().min((s1,s2) -> Integer.compare(s1,s2))
List.of(45,535,32,5,6).stream().min((s1,s2) -> Integer.compare(s1,s2)).get()
List.of(45,535,32,5,6).stream().min((s1,s2) -> Integer.compare(s1,s2)).get()
List.of(45,535,32,5,6).stream().filter(e -> e%2==1).collect(Collectors.toList())
List.of(45,535,32,5,6).stream().filter(e -> e%2==0).collect(Collectors.toList())
IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList())
IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList())
List.of(23,43,53).stream().filter(n -> n%2==0).forEach(e->System.out.println(e))
List.of(23,43,53).stream().filter(n -> n%2==0).max((n1,n2)->Integer.compare(n1,n2))
List.of(23,43,53).stream().filter(n -> n%2==0).max((n1,n2)->Integer.compare(n1,n2))
List.of(23,43,53).stream().filter(n -> n%2==0).max((n1,n2)->Integer.compare(n1,n2)).orElse(0)