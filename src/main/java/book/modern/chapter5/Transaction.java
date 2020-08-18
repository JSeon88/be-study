package book.modern.chapter5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    private Trader trader;
    private int year;
    private int value;
}
