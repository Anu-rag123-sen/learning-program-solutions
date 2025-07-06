using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        var category = new Category
        {
            CategoryId = 1,
            Name = "Electronics",
            Products = new List<Product>()
        };

        var supplier = new Supplier
        {
            SupplierId = 1,
            Name = "Samsung",
            Products = new List<Product>()
        };

        var product = new Product
        {
            ProductId = 1,
            Name = "Smart TV",
            Quantity = 10,
            Category = category,
            CategoryId = category.CategoryId,
            Supplier = supplier,
            SupplierId = supplier.SupplierId
        };

        category.Products.Add(product);
        supplier.Products.Add(product);

        Console.WriteLine($"Product: {product.Name}, Category: {product.Category.Name}, Supplier: {product.Supplier.Name}");
    }
}
