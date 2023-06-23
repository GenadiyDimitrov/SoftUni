using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassBoxData
{
    internal class Box
    {
        public Box(double length, double width, double height)
        {
            Length = length;
            Width = width;
            Height = height;
        }

        private double _length;

        public double Length
        {
            get { return _length; }
            set
            {
                if (value > 0) _length = value;
                else throw new ArgumentException($"{nameof(Length)} cannot be zero or negative.");
            }
        }

        private double _width;

        public double Width
        {
            get { return _width; }
            set
            {
                if (value > 0) _width = value;
                else throw new ArgumentException($"{nameof(Width)} cannot be zero or negative.");
            }
        }
        private double _height;

        public double Height
        {
            get { return _height; }
            set
            {
                if (value > 0) _height = value;
                else throw new ArgumentException($"{nameof(Height)} cannot be zero or negative.");
            }
        }
        private double _sideArea => _width * _height;
        private double _surfaceArea => _length * _height;
        private double _doubleSurfaceArea => 2 * _surfaceArea;
        private double _doubleSideArea => 2 * _sideArea;
        public double SurfaceArea() { return 2 * _length * _width + _doubleSurfaceArea + _doubleSideArea; }
        public double LateralSurfaceArea() { return _doubleSurfaceArea + _doubleSideArea; }
        public double Volume() { return _length * _sideArea; }

        public override string ToString()
        {
            return $"" +
                $"Surface Area - {SurfaceArea():F2}{Environment.NewLine}" +
                $"Lateral Surface Area - {LateralSurfaceArea():F2}{Environment.NewLine}" +
                $"Volume - {Volume():F2}";
        }
    }
}
