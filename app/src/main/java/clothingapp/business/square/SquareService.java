package clothingapp.business.square;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SquareService {
    @POST("/chargeForCookie")
    Call<Void> charge(@Body ChargeRequest request);

    class ChargeErrorResponse {
        String errorMessage;
    }

    class ChargeRequest {
        final String nonce;

        ChargeRequest(String nonce) {
            this.nonce = nonce;
        }
    }
}
