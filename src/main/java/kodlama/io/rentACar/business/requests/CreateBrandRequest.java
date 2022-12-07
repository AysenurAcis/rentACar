package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {    // api yi kullanan son kullanıcan bişey alıyorsak request , veriyorsak response kullanıyoruz
   private String name;
}
