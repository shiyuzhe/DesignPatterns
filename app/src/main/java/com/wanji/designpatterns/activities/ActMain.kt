package com.wanji.designpatterns.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wanji.designpatterns.R
import com.wanji.designpatterns.creational.abstractFactoryPattern.*
import com.wanji.designpatterns.creational.simpleFactoryPattern.Product
import com.wanji.designpatterns.creational.simpleFactoryPattern.ProductFac2
import com.wanji.designpatterns.creational.simpleFactoryPattern.ProductFactory
import com.wanji.designpatterns.creational.simpleFactoryPattern.exec
import com.wanji.designpatterns.creational.factoryMethodPattern.FactoryB
import com.wanji.designpatterns.creational.factoryMethodPattern.IFactory
import kotlinx.android.synthetic.main.act_main.*

class ActMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)
        actBuilder.setOnClickListener { startActivity(Intent(this, ActBuilder::class.java)) }

        abstractFactoryPattern()
//        simpleFactoryPattern()
//        factoryMethodPattern()
        abstractFactoryPattern2()
        abstractFactoryPattern3()

    }

    //反射User,Department+简单工厂(可消除IFac)
    fun abstractFactoryPattern3() {
        val dataAccess = DataAccess2("C")
        val user = dataAccess.createUser()
        val createDepart = dataAccess.createDepart()
        createDepart?.insert("invoke C")
        user?.insert("invoke C")
        Log.e("syz", "abstractFactoryPattern3:user:" + user?.getUserName() + "---depart:" + createDepart?.getDepartmentName())
    }

    //反射Fac+简单工厂
    fun abstractFactoryPattern2() {
        val dataAccess = DataAccess("com.wanji.designpatterns.abstractFactoryPattern.FacA")
        val user = dataAccess.createUser()
        val createDepart = dataAccess.createDepart()
        createDepart?.insert("invoke A")
        user?.insert("invoke A")
        Log.e("syz", "abstractFactoryPattern2:user:" + user?.getUserName() + "---depart:" + createDepart?.getDepartmentName())
    }

    //抽象工厂
    fun abstractFactoryPattern() {
        val ifac: IFac = FacA()
        val iUser: IUser = ifac.createUser()
        val iDepartment: IDepartment = ifac.createDepart()
        iUser.insert("insert a user into DB")
        iDepartment.insert("insert a department into DB")
        val name = iUser.getUserName()
        val name1 = iDepartment.getDepartmentName()
        content.setText("user name = $name\ndepartment name = $name1")


    }

    //工厂模型
    fun factoryMethodPattern() {
        val factory: IFactory = FactoryB()
        val show = factory.getProduct().show()
        content.setText("factory.getProduct().show()+$show")
    }

    //简单工厂
    fun simpleFactoryPattern() {
        val productA = ProductFactory.getInstance().getProduct("A")
        val productB: Product = exec(ProductFac2.ProductB)
        content.setText("productA:" + productA.show() + "\nproductB:" + productB.show())
    }
}
