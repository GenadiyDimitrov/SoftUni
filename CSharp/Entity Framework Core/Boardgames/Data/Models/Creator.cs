using System.ComponentModel.DataAnnotations;
using static System.Net.Mime.MediaTypeNames;

namespace Boardgames.Data.Models
{
    public class Creator
    {
        [Key]
        public int Id { get; set; }
        [Required]
        [MinLength(2)]
        [MaxLength(7)]
        public string FirstName { get; set; }
        [Required]
        [MinLength(2)]
        [MaxLength(7)]
        public string LastName { get; set; }

        public virtual ICollection<Boardgame> Boardgames { get; set; } = new HashSet<Boardgame>();
    }
    //•	Id – integer, Primary Key
    //•	FirstName – text with length[2, 7] (required) 
    //•	LastName – text with length[2, 7] (required)
    //•	Boardgames – collection of type Boardgame

}