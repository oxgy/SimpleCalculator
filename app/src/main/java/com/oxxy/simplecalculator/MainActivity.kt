package com.oxxy.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oxxy.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.sum.setOnClickListener {

            if (binding.firstNum.text.toString() != "" && binding.secondNum.text.toString() != "") {
                var firstNum = binding.firstNum.text.toString().toInt()
                var secondNum = binding.secondNum.text.toString().toInt()
                var result = firstNum + secondNum
                binding.resultText.text = "Result:  $result"
            } else {
                binding.resultText.text = "Please enter two numbers"
            }
        }

            binding.minus.setOnClickListener {
                if (binding.firstNum.text.toString() != "" && binding.secondNum.text.toString() != "") {
                    var firstNum = binding.firstNum.text.toString().toInt()
                    var secondNum = binding.secondNum.text.toString().toInt()
                    var result = firstNum - secondNum
                    binding.resultText.text = "Result:  $result"
                } else {
                    binding.resultText.text = "Please enter two numbers"
                }
            }

                binding.divide.setOnClickListener {
                    if (binding.firstNum.text.toString() != "" && binding.secondNum.text.toString() != "") {
                        var firstNum = binding.firstNum.text.toString().toInt()
                        var secondNum = binding.secondNum.text.toString().toInt()
                        var result: Float = firstNum.toFloat() / secondNum.toFloat()
                        binding.resultText.text = "Result:  $result"
                    } else {
                        binding.resultText.text = "Please enter two numbers"
                    }
                }

                    binding.multiply.setOnClickListener {
                        if (binding.firstNum.text.toString() != "" && binding.secondNum.text.toString() != "") {
                            var firstNum = binding.firstNum.text.toString().toInt()
                            var secondNum = binding.secondNum.text.toString().toInt()
                            var result = firstNum * secondNum
                            binding.resultText.text = "Result:  $result"
                        } else {
                            binding.resultText.text = "Please enter two numbers"
                        }

                    }


                }


            }

