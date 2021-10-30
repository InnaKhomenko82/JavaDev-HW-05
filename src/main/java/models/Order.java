package models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order implements BaseEntity<Long>{

    private static final long serialVersionUID = 3903402690623533383L;

    @SerializedName("id")
    private Long id;

    @SerializedName("petId")
    private Long petId;

    @SerializedName("quantity")
    private Integer quantity;

    @SerializedName("shipDate")
    private LocalDate shipDate;

    @SerializedName("status")
    private OrderStatus status;

    @SerializedName("complete")
    private Boolean complete;
}
