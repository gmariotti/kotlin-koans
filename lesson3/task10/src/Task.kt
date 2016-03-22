// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> =
    this.customers.fold(orderedProducts, {
        orderedByAll, customer -> orderedByAll.intersect(customer.orders.flatMap { it.products })
    })
