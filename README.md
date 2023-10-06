
# Android SignCheck & Protector

Protect your android app from any modification or decompile with this tool


## Documentation
 only need add this maven repository:
- ***delete #SPACE# in password line in below code: ***

  maven {
      url uri("https://maven.pkg.github.com/SajjadAkbariDev/AndroidSignCheck")
      credentials {
          username = "SajjadAkbariDev"
          password = "ghp_1RmhPU1rOaz8U1j#SPACE#uhPiAxtlXeaYbkj3MeiBm"
      }
  }

 and a implement:

     implementation("sajjad.akbari:signcheck:1.0")


## Demo

first need to get SignHashCode . so you have to sign your app with your keystore and run it with this code to get SignHashCode (is copied to your clipboard!)

        Toast.makeText(applicationContext, SignCheck.GetSignHashCode(applicationContext)+"", Toast.LENGTH_LONG).show()

ok now SignHashCode is copyed to your clipboard.

- Replace previous code with this code

with this code you tell if SignHashCode is different things . close app!

        SignCheck.CheckSignHashCode("YOUR SIGN HASH CODE",applicationContext)

## Authors

- [@SajjadAkbariDev](https://github.com/SajjadAkbariDev)


## Support

For support, email sajjad.akbari.dev@outlook.com

Telegram: https://t.me/UnlimitL
