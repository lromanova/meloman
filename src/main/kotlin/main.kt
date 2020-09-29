fun main(){
    val prev_amount: Int = (1..20_000).random()
    val current_amount: Int = (1..20_000).random()

    val const_customer: Int = (0..1).random()

    val first_interval_min: Int = 1_001

    val first_interval_max: Int = 10_000

    val first_discount_sum = 100

    val const_customer_discount = 1

    val max_discount = 5

    val amount = if (prev_amount < first_interval_min) current_amount
    else if (prev_amount <= first_interval_max) current_amount - first_discount_sum
    else current_amount * (100 - max_discount) / 100

    val result = if (const_customer == 0) amount else amount * (100 - const_customer_discount)/100

    println("Сумма предыдущей покупки $prev_amount рублей")
    println("Стоимость текущей покупки без скидок $current_amount рублей")
    println("Наличие скидки постоянного покупателя 1-да, 0-нет: $const_customer")
    println("Итоговая сумма $result рублей")


}