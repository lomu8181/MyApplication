package com.hlomu.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // 레이아웃 파일을 사용하려면 해당 줄이 필요합니다.

        // 변수 입력
        print("변수 VA를 입력하세요: ")
        val VA = readLine()?.toDoubleOrNull() ?: 0.0

        print("변수 VB를 입력하세요: ")
        val VB = readLine()?.toDoubleOrNull() ?: 0.0

        print("변수 VC를 입력하세요: ")
        val VC = readLine()?.toDoubleOrNull() ?: 0.0

        // 변수 계산
        val VSUM = VA + VB + VC
        val VAVG = VSUM / 3
        val VAMG = VA - VAVG
        val VBMG = VB - VAVG
        val VCMG = VC - VAVG

        // 계산식 결과 계산
        val ImbVA = (abs(VAMG) / VAVG) * 100
        val ImbVB = (abs(VBMG) / VAVG) * 100
        val ImbVC = (abs(VCMG) / VAVG) * 100

        // 결과 출력
        println("------------------------------------------------------")
        println("VAVG = ( $VA + $VB + $VC ) ÷ 3")
        println("           = ( $VSUM ) ÷ 3 = $VAVG")
        println("ImbVA = [ ABS( $VA - $VAVG ) ÷ $VAVG ]")
        println("            = [ ABS( $VAMG ) ÷ $VAVG ] = $ImbVA")
        println("ImbVB = [ ABS( $VB - $VAVG ) ÷ $VAVG ]")
        println("            = [ ABS( $VBMG ) ÷ $VAVG ] = $ImbVB")
        println("ImbVC = [ ABS( $VC - $VAVG ) ÷ $VAVG ]")
        println("            = [ ABS( $VCMG ) ÷ $VAVG ] = $ImbVC")
        println("------------------------------------------------------")
    }
}