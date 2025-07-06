using System;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using RetailInventorySystem.Models;

class Program
{
    static async Task Main(string[] args)
    {
        using var context = new AppDbContext();

        Console.WriteLine("📦 Products in Inventory:\n");

        // Get all products with their Category and Supplier
        var products = await context.Products
            .Include(p => p.Category)
            .Include(p => p.Supplier)
            .ToListAsync();

        foreach (var product in products)
        {
            string categoryName = product.Category?.Name ?? "No Category";
            string supplierName = product.Supplier?.Name ?? "No Supplier";

            Console.WriteLine($"🛒 Product: {product.Name}");
            Console.WriteLine($"   💰 Price: ₹{product.Price}");
            Console.WriteLine($"   📂 Category: {categoryName}");
            Console.WriteLine($"   🚚 Supplier: {supplierName}");
            Console.WriteLine();
        }

        Console.WriteLine($"✅ Total Products: {products.Count}");
    }
}
