fun main() {
    val prev_amount: Int = (100..2_000_000).random()
    val current_amount: Int = (100..2_000_000).random()

    val const_customer: Int = (0..1).random()

    val first_interval_min: Int = 100_100

    val first_interval_max: Int = 1_000_000

    val first_discount_sum = 10_000

    val const_customer_discount = 1

    val max_discount = 5

    val amount = if (prev_amount < first_interval_min) current_amount
    else if (prev_amount <= first_interval_max) current_amount - first_discount_sum
    else current_amount * (100 - max_discount) / 100

    val result = if (const_customer == 0) amount else amount * (100 - const_customer_discount) / 100

    println("Сумма предыдущей покупки " + convertAmountToString(prev_amount))
    println("Стоимость текущей покупки без скидок " + convertAmountToString(current_amount))
    println("Наличие скидки постоянного покупателя 1-да, 0-нет: $const_customer")
    println("Итоговая сумма " + convertAmountToString(result))


}

fun convertAmountToString(amount: Int) : String {
    val ama_rub = kotlin.math.round ((amount/100).toDouble()).toInt()
    val ama_kop = amount.toString().substring(amount.toString().length-2)

    return "$ama_rub руб. $ama_kop к."
}