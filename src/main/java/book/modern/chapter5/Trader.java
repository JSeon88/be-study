package book.modern.chapter5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trader {
    private String name;
    private String city;

    public String toString() {
        return "Trader: " + this.name + " in " + this.city;
    }
}
