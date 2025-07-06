using Microsoft.EntityFrameworkCore;

public class AppDbContext : DbContext
{
    public DbSet<Product> Products { get; set; }
    public DbSet<Category> Categories { get; set; }
    public DbSet<Supplier> Suppliers { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        // Use SQLite as your database provider
        optionsBuilder.UseSqlite("Data Source=retail.db");
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        // Optional: Define relationships
        modelBuilder.Entity<Category>()
            .HasMany(c => c.Products)
            .WithOne(p => p.Category)
            .HasForeignKey(p => p.CategoryId);

        modelBuilder.Entity<Supplier>()
            .HasMany(s => s.Products)
            .WithOne(p => p.Supplier)
            .HasForeignKey(p => p.SupplierId);
    }
}
