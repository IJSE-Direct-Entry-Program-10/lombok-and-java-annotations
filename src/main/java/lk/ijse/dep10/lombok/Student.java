package lk.ijse.dep10.lombok;

import lombok.*;

import java.io.Serializable;

@ToString(exclude = "id")
@Data /* = @NoArgConstructor + @Getter + @Setter + @ToString + @EqualsAndHashCode */
@AllArgsConstructor
public class Student implements Serializable {
    private int id;
    private String name;
    //@Setter(AccessLevel.NONE)
    private String contact;
}
