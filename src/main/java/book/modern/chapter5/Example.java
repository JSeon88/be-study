package book.modern.chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );

        // 1. 2011년에 일어난 모든 트랙잭션을 찾아 값을 오름차순으로 정의하시오
        List<Transaction> list1 = transactions.stream()
                                                .filter(f -> 2011 == f.getYear())
                                                .sorted(Comparator.comparing(Transaction::getValue))
                                                .collect(Collectors.toList());
        list1.forEach(System.out::println);

        System.out.println();


        // 2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오
        List<String> citis = transactions.stream()
                                            .map(city -> city.getTrader().getCity())
                                            .distinct()
                                            .collect(Collectors.toList());
        citis.forEach(System.out::println);
        System.out.println();


        // 3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
//        List<String> names = transactions.stream()
//                                            .map(Transaction::getTrader)
//                                            .filter(f -> "Cambridge".equals(f.getCity()) )
//                                            .distinct()
//                                            .map(Trader::getName)
//                                            .sorted()
//                                            .collect(Collectors.toList());

        List<Trader> names = transactions.stream()
                                            .map(Transaction::getTrader)
                                            .filter(f -> "Cambridge".equals(f.getCity()) )
                                            .distinct()
                                            .sorted(Comparator.comparing(Trader::getName))
                                            .collect(Collectors.toList());

        names.forEach(System.out::println);
        System.out.println();


        // 4. 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오
        String sortedNames = transactions.stream()
                                            .map(m -> m.getTrader().getName())
                                            .distinct()
                                            .sorted()
                                            .collect(Collectors.joining());

        System.out.println(sortedNames);
        System.out.println();
    }
}
