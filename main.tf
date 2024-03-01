
provider "aws" {
  region     = "us-east-1"
  access_key = "AKIAIOSFODNN7EXAMPLE"
  secret_key = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY"
}

resource "aws_s3_bucket" "vulnerable_bucket" {
  bucket = "my-vulnerable-bucket"
  acl    = "public-read" # Insecure ACL configuration

  versioning {
    enabled = false # Lack of versioning can be risky
  }

  server_side_encryption_configuration {
    # Missing encryption configuration
  }
}
