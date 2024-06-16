
import androidx.lifecycle.ViewModel
import com.example.newadvance.model.calculatedata

class calculateviewmodel:ViewModel() {
    fun calculatesum(num1:Int,num2:Int):calculatedata{
       val sum= num1+num2
        return calculatedata(num1,num2,sum)
    }
}