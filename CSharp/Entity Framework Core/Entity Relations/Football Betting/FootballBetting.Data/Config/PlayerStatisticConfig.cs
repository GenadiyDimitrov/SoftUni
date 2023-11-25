namespace P02_FootballBetting.Data.Config
{
    using Microsoft.EntityFrameworkCore;
    using Microsoft.EntityFrameworkCore.Metadata.Builders;
    using Models;

    public class PlayerStatisticConfig : IEntityTypeConfiguration<PlayerStatistic>
    {
        public void Configure(EntityTypeBuilder<PlayerStatistic> builder)
        {
            builder.HasKey(e => new { e.GameId, e.PlayerId });

            builder.HasOne(e => e.Game)
                .WithMany(g => g.PlayersStatistics)
                .HasForeignKey(e => e.GameId);

            builder.HasOne(e => e.Player)
                .WithMany(p => p.PlayersStatistics)
                .HasForeignKey(e => e.PlayerId)
                .OnDelete(DeleteBehavior.Restrict);
        }
    }
}
