package com.example.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
viewBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.clear.setOnClickListener {
            if (viewBinding.input.text.length>0)
            {
                viewBinding.input.text=viewBinding.input.text.toString().subSequence(0,viewBinding
                    .input.text.toString().length-1)
            }
        }
        viewBinding.btn0.setOnClickListener {
            viewBinding.input.append("0")
        }
        viewBinding.btn0.setOnClickListener {
            viewBinding.input.append("0")
        }
        viewBinding.btn1.setOnClickListener {
            viewBinding.input.append("1")
        }
        viewBinding.btn2.setOnClickListener {
            viewBinding.input.append("2")
        }
        viewBinding.btn3.setOnClickListener {
            viewBinding.input.append("3")
        }
        viewBinding.btn4.setOnClickListener {
            viewBinding.input.append("4")
        }
        viewBinding.btn5.setOnClickListener {
            viewBinding.input.append("5")
        }
        viewBinding.btn6.setOnClickListener {
            viewBinding.input.append("6")
        }
        viewBinding.btn7.setOnClickListener {
            viewBinding.input.append("7")
        }
        viewBinding.btn8.setOnClickListener {
            viewBinding.input.append("8")
        }
        viewBinding.btn9.setOnClickListener {
            viewBinding.input.append("9")
        }
        viewBinding.btnplus.setOnClickListener {
            viewBinding.input.append("+")
        }
        viewBinding.btnmin.setOnClickListener {
            viewBinding.input.append("-")
        }
        viewBinding.btnmul.setOnClickListener {
            viewBinding.input.append("*")
        }
        viewBinding.btndiv.setOnClickListener {
            viewBinding.input.append("/")
        }
        viewBinding.btndot.setOnClickListener {
            viewBinding.input.append(".")
        }
        viewBinding.btnpara1.setOnClickListener {
            viewBinding.input.append("(")
        }
        viewBinding.btnpara2.setOnClickListener {
            viewBinding.input.append(")")
        }
        viewBinding.btnac.setOnClickListener {
            viewBinding.input.text=""
            viewBinding.output.text=""
        }
        viewBinding.btnequal.setOnClickListener {
val expression=ExpressionBuilder(viewBinding.input.text.toString()).build()
            val result=expression.evaluate()
            val longresult=result.toLong()
            if (result==longresult.toDouble()){
                viewBinding.output.text=longresult.toString()
            }
            else{
                viewBinding.output.text=result.toString()
            }
        }
    }
}