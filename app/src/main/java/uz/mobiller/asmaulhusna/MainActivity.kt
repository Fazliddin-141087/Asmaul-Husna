package uz.mobiller.asmaulhusna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import uz.mobiller.asmaulhusna.adapter.MyAdabterListView
import uz.mobiller.asmaulhusna.models.AsmaulHusna
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var myAdabterListView: MyAdabterListView
    lateinit var list: ArrayList<AsmaulHusna>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        myAdabterListView = MyAdabterListView(list)
        expanded_menu.adapter = myAdabterListView

        expanded_menu.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "${list[position].name}", Toast.LENGTH_SHORT).show()
        }

    }

    private fun loadData() {
        list = ArrayList()

        list.add(AsmaulHusna("Аллоҳ", 1, R.drawable.allah))
        list.add(AsmaulHusna("ар-Роҳман", 2, R.drawable.ar_rohman))
        list.add(AsmaulHusna("ар-Роҳийм", 3, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ар-Малик", 4, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Қуддус", 5, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ас-Салом", 6, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Муъмин", 7, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Мухаймин", 8, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Азийз", 9, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Жаббор", 10, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Мутакаббир", 11, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Холиқ", 12, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Бориъ", 13, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Мусаввир", 14, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ғаффор", 15, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Қаҳҳор", 16, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ваҳҳоб", 17, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ар-Раззоқ", 18, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Фаттоҳ", 19, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Алийм", 20, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Қобиз", 21, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Босит", 22, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Хофиз", 23, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ар-Рофиь", 24, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Муъизз", 25, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Музилл", 26, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ас-Самийъ", 27, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Басийр", 28, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ҳакам", 29, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Адл", 30, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Латийф", 31, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Хобийр", 32, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ҳалийм", 33, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Азийм", 34, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ғофур", 35, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("аш-Шакур", 36, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Алий", 37, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Кабийр", 38, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ҳафийз", 39, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Муқийт", 40, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ҳасийб", 41, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Жалийл", 42, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Карийм", 43, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Роқийб", 44, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Мужийб", 45, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Восиъ", 46, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ҳакийм", 47, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Вадуд", 48, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Мажийд", 49, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Боъис", 50, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("аш-Шаҳийд", 51, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ҳаққ", 52, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Вакийл", 53, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Қовийй", 54, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Матийн", 55, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Валийй", 56, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Ҳамийд", 57, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Муҳсий", 58, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Мубдиъ", 59, R.drawable.ic_launcher_background))
        list.add(AsmaulHusna("ал-Муҳий", 60, R.drawable.ic_launcher_background))

    }

}